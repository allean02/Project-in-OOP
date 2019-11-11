
class Animal{
     void Kangaroo(){
        
    }
}
class Ikaw extends Animal{
    
    @java.lang.Override
    public void Kangaroo(){
        System.out.println("Way Kamo");
    }
}
class Siya extends Animal{
    
    @java.lang.Override
    public void Kangaroo(){
        System.out.println("Wa siya kagusto nimo");
    }
}
public class Override {
    public static void main(String[]  args){
        Animal lisod;
        lisod = new Ikaw();
        lisod.Kangaroo();
        lisod = new Siya();
        lisod.Kangaroo();
    }
}
