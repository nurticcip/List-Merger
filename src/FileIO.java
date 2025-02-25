import java.io.*;
class Person implements Serializable{
    public Person() {}
    public String toString(){return "person";}
}

public class FileIO {
    public static void main(String[] args) {
        //FileReader and FileWriter
        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("First Line\n");
            fw.append("Second Line",0, 10);
            fw.close();

            FileReader fr = new FileReader("file.txt");
            int c;
            while((c = fr.read())!=-1){
                System.out.print((char)c);
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //FileInputStream and FileOutputStream to read bytes at a time
        int[] array = {1,2,3,4,5};
        try {
            FileOutputStream fos = new FileOutputStream("array.bin");
            for(int i:array){
                fos.write(i);
            }
            fos.close();

            FileInputStream fis = new FileInputStream("array.bin");
            int result;
            while((result = fis.read())!=-1){
                System.out.println(result);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DataInputStream and DataOutputStream
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("dis.bin"));
            dos.writeBoolean(true);
            dos.writeDouble(3.14);
            dos.writeUTF("ru");
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("dis.bin"));
            int result;
            System.out.println(dis.readBoolean());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            dis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //ObjectInputStream and ObjectOutputStream

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
            Person p = new Person();
            oos.writeObject(p);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
            Person po = (Person) ois.readObject();
            System.out.println(po.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
