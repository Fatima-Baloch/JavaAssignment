package records;


public class Records {

    public static void main(String[] args) {
     NameRecords Names = new NameRecords();
     System.out.println("Inserting");
     Names.Insert("Soda");
     Names.Insert("Mahekan");
     Names.Insert("Fatima");
     Names.Insert("Fariha");
     Names.Insert("Jwahira");
     Names.Insert("Jannat");
     Names.Insert("Sassi");
     Names.Insert("Sadia");
     Names.Insert("Mahal");
     Names.Insert("Almas");
     Names.Insert("Saba");
     Names.Insert("Mazila");
     Names.Insert("Aliya");
     Names.Treverse();
     System.out.println("Finding");
     Names.Find("Fariha");
     System.out.println("Deleting");
     Names.Delete(12);
     Names.Treverse();
     System.out.println("Sorting");
     Names.Sort();
     Names.Treverse();
     
     
     
    }
    
}
