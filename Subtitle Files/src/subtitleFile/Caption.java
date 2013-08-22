package subtitleFile;

public class Caption {
	/**
	 * Default constructor
	 */
	public Caption() {
		
	}
	
	
	/**
	 * Deep copy contructor
	 * @param c The original object.
	 */
	public Caption(Caption c) {
		this.style = new Style(c.style);
		this.region = new Region(c.region);
		this.start = new Time(c.start);
		this.end = new Time(c.end);
		this.content = new String(c.content);
	}
	
	public Style style;
	public Region region;
	
	public Time start;
	public Time end;
	
	public String content="";

}
