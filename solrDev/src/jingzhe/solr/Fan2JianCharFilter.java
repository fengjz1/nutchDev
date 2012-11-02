package jingzhe.solr;

import java.io.IOException;

import org.apache.lucene.analysis.BaseCharFilter;
import org.apache.lucene.analysis.CharStream;

public class Fan2JianCharFilter extends BaseCharFilter {

	public Fan2JianCharFilter(CharStream in) {
		super(in);
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		//繁体转简体
		int result = super.read(cbuf, off, len);
		Fan_jian.getInstance().convert(cbuf, 0);
		return result;
	}

	@Override
	public int read() throws IOException {
		//繁体转简体
		int result = super.read();
		if(result<0)
			return result;
		else
			return Fan_jian.getInstance().convert((char)result, 0);
	}
	
}
