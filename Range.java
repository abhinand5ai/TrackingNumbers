package Tracking_numbers;

public class Range {  
	public int start , end;
	Range (int start ,int end) {
		this.start = start;
		this.end = end;
	}
//	this =  |....|
//	Range r = +....+
	public boolean isSuperSet(Range r){//			|..+...+..|
		return start<r.start && r.end <end;
	}
	
	public boolean isSubset(Range r){//				+..|...|..+
		return start>r.start && r.end >= end || start>=r.start && r.end > end;
	}
	
	public boolean isDisjointMore(Range r){//		+....+..|....|
		return r.end < start;
	}
	
	public boolean isDisjointLess(Range r){//		|....|..+....+		
		return end<r.start;
	}
	
	public boolean isIntersectionLess(Range r){//	|....+..|....+
		return  start< r.start && r.start <= end;
	}
	
	public boolean isIntersectionMore(Range r){//	+...|.+...|
		return r.start < start &&  start<= r.end;
	}
}
