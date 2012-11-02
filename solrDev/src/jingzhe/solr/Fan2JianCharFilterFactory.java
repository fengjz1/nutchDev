package jingzhe.solr;


import org.apache.lucene.analysis.CharStream;
import org.apache.solr.analysis.BaseCharFilterFactory;

public class Fan2JianCharFilterFactory extends BaseCharFilterFactory {

  public Fan2JianCharFilter create(CharStream input) {
    return new Fan2JianCharFilter(input);
  }

}
