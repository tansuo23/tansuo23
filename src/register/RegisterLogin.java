package register;


import java.nio.ByteBuffer;

/**
 * 只读缓冲区
 */
public class RegisterLogin {
     static public  void main(String[] args) throws Exception{
         ByteBuffer buffer = ByteBuffer.allocate(1000);
         for (int i = 0; i < buffer.capacity(); i++) {
             buffer.put((byte)i);
         }
         ByteBuffer readbuffer = buffer.asReadOnlyBuffer();
         for (int i = 0; i < buffer.capacity() ; i++) {
             byte b = buffer.get(i);
             b *= 50;
             buffer.put(i,b);
         }
         readbuffer.position(0);
         readbuffer.limit(buffer.capacity());
         while(readbuffer.remaining() >0){
             System.out.println(readbuffer.get());
         }
    }
}
