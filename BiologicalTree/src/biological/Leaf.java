package biological;

public class Leaf extends Twig{
    String type;

    public Leaf(String type) {
        this.type = type;

    }



    public boolean equals(Object ptype)
    {
        //If the object I compare myself with is null(is not existent) than the
        //comparison is false because I am existent.
        if(ptype == null)
        {
            return false;
        }
        //If the object I compare myself with is myself the result is true.
        if(ptype == this)
        {
            return true;
        }

        //If the object I compare myself with is not of my class
        //the result is false.
        if(!ptype.getClass().equals(getClass()))
        {
            return false;
        }

        biological.Leaf  that = (Leaf) ptype;



        return this.type == that.type;
    }


    @Override
    public String toString() {
        return type;
    }

}
