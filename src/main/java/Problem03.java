public class Problem03 
{
    //Step one is to parse the data 
    //Step two is to find all possible strings
    //step three get the strings all of length k
    //step four get the strings that are distinct 

    public String dataParse(String input)
    {
        String parsedData = "";
        input = input.replaceAll("[^a-zA-Z]", "");
        String allLowercase = input.toLowerCase();
        parsedData = allLowercase;
        return parsedData;
    }
    
    public String findallStrings(String input)
    {
        String subStrings = "";
        for (int i = 0; i < input.length(); i++) 
        {
               for (int j = i+1; j <= input.length(); j++) 
               {
                    subStrings += input.substring(i,j);
                    subStrings += "\n";     
               }
        }
        return subStrings.trim(); 
    }
    public String findStringsofalength(String input, Integer k)
    {
        String specificString = "";
        String substrings = findallStrings(input);
        String[] words = substrings.split("\n");
        for (int i = 0; i < words.length; i++) 
        {
            if (words[i].length() == k) 
            {
                specificString += words[i];
                specificString+= " ";
            }
        }

        return specificString.trim();
    }
    public Boolean uniquedistinctCharacters(String input)
    {
        Boolean uniqueCharacters = true;
        for (int i = 0; i < input.length(); i++) 
        {
            for (int j = i+1; j < input.length(); j++) 
            {
                if (input.charAt(i) == input.charAt(j)) 
                {
                    uniqueCharacters = false;
                }
            }    
        }
        return uniqueCharacters;
    }
    public Integer findDistinctCharacterInput(String input , Integer k)
    {
        String parsed = dataParse(input);
        String ofLength = findStringsofalength(parsed, k);
        String [] words = ofLength.split(" ");
        Integer count = 0;
        for (int i = 0; i < words.length; i++) 
        {
             if(uniquedistinctCharacters(words[i]) == true)
             {
                count++;
             }
        }

        return count;        
    }

}
