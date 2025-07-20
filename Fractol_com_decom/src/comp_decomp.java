
  import java.io.ByteArrayOutputStream;
  import java.io.IOException;
  import java.util.zip.DeflaterOutputStream;
  import java.util.zip.InflaterOutputStream;

   interface comp_decom {
        byte[] compress(byte[] data);
        byte[] decompress(byte[] compresseddata);
    }



