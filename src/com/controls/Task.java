package com.controls;

import com.objects.Segment;
import com.controls.*;

public class Task {
  Segment s1, s2;
  
  Intersection intersect;
  Angle angle;
  
  public Task(Segment s1, Segment s2) {
    this.s1 = s1;
    this.s2 = s2;
    
    findIntersection();
    findAngle();
  }

  // 1. Get intersection point.
  private void findIntersection() {
    this.intersect = new Intersection(s1, s2);
  }
  
  // 2. Get angle between segments
  private void findAngle() {
    this.angle = new Angle(s1, s2);
  }
  
  public String getResult() {
    return "Intersection: " + intersect.getResult() + ", Angle: " + angle.getResult() + ".";
  }
}
