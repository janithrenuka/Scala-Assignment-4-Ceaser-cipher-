//import io.StdIn

object ceaserCipher{

    def main(args:Array[String]){

       
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val encryption = (c: Char,key : Int, a: String)=> a((a.indexOf(c.toUpper)+key)%a.size);
    val decryption = (c: Char,key : Int, a: String)=> a((a.indexOf(c.toUpper)-key)%a.size);

     var text = scala.io.StdIn.readLine("Enter text:");
     println("Key :");
     var key = scala.io.StdIn.readInt();

     var cipher= (patt:(Char,Int,String)=> Char,text:String,key: Int,a: String)=> text.map(patt(_,key,a));

     val encry = cipher(encryption,text,key,alphabet);
     val decry = cipher(decryption,text,key,alphabet);

     println("Text : "+text);
     println("Encrypted text :"+encry);
     println("Decrypted text :"+decry);

    }

}