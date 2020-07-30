public class Problem04 
{
    //Step 1 go through the array
    //Step 2 update the product array at element i as you're iterating through the input array until ith index
    //step 3 go through the array backwards 
    //step 4 update product array at elemnt i as you iterate through the input array until ith index

    public void intializeArray(Integer[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            array[i]= 1;    
        }
    }
    public Integer[] productArray(Integer[] array)
    {
        
        Integer[] product = new Integer[array.length];
        Integer temp = 1;
        Integer i = 1;
        if(array.length == 1) //if the length is one then there are no other elements so 0*0 = 0
        {
            product[0] = 0;
            return product;
        }
        intializeArray(product);
        for (i = 0; i < product.length; i++) //Going through the array
        {
            product[i] =temp; //update the product array at ith element
            temp = temp *array[i]; //update temp 
        }
        temp= 1; 
        for(i = array.length -1; i>=0; i--) //going through array backwards 
        {
            product[i] = product[i] *temp;
            temp = temp * array[i];
        }


        return product;
    }
}
