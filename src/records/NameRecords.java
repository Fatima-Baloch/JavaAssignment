
package records;

import java.util.Arrays;


public class NameRecords {
    private String[] Name = new String[10];
    int index =0;
    void Insert(String data){
        if(index<Name.length){
            Name[index++]=data; 
        }
        else{
            System.out.println("Array is full");
        }
    }
    void Treverse(){
        for(int i=0; i<this.index; i++){
        System.out.println("Name:"+" "+ Name[i]);
    }
    }
    int Find(String data){
        for(int i=0; i<this.index;i++){
            if(Name[i]==data){
               System.out.println(data+": "+i);
               return i;         
            }
        }
        return -1;
    }
    void Delete(int index2){
        if(index2 > index && index2<Name.length){
            System.out.println("Index is not Assigned Value");
        }
        else if(index2>Name.length){
            System.out.println("This index is not in Array");
            return ;
        }
        for(int i=index2;i<index-1;i++){
                Name[i]= Name[i+1];
        }
        index = index -1;    
    }
    void Sort(){
        Arrays.sort(Name);
    }
    
}
