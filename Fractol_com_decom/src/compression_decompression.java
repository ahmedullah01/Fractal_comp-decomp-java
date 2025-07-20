import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

 public class compression_decompression implements  comp_decom{
      public  byte[] compress(byte[] data){
          try(ByteArrayOutputStream out = new ByteArrayOutputStream(); DeflaterOutputStream deflator = new DeflaterOutputStream(out) //deflator onlu compressed our data and send the data to byte array or showing
          ){
              deflator.write(data);
              deflator.finish();
              return  out.toByteArray();
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }


      public  byte[] decompress(byte[] compresseddata){
          try(ByteArrayOutputStream out = new ByteArrayOutputStream(); InflaterOutputStream inflatar = new InflaterOutputStream(out)){
              inflatar.write(compresseddata);
              inflatar.finish();

              return out.toByteArray();
          } catch (Exception e) {
              System.out.println("ERROR" + e);
          }
          return new byte[0];
      }}
