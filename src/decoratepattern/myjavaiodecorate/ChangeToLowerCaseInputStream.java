package decoratepattern.myjavaiodecorate;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ChangeToLowerCaseInputStream extends FilterInputStream {

	public ChangeToLowerCaseInputStream(InputStream inputStream) {
		// TODO Auto-generated constructor stub
		super(inputStream);
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c = super.read();
		return c == -1 ? c : Character.toLowerCase((char)c);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] =  (byte) Character.toLowerCase((char)b[i]);
		}
		
		return result;
	}
	
	
	
	
	
}
