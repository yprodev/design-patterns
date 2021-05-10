package com.dpatterns;

import com.dpatterns.pattern.state.BrushTool;
import com.dpatterns.pattern.state.Canvas;
import com.dpatterns.pattern.state.EraserTool;
import com.dpatterns.pattern.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
	    var canvas = new Canvas();
	    canvas.setCurrentTool(new SelectionTool());
	    canvas.mouseDown();
	    canvas.mouseUp();
		canvas.setCurrentTool(new BrushTool());
		canvas.mouseDown();
		canvas.mouseUp();
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
