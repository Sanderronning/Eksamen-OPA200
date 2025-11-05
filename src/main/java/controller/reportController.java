/**
 * @author Tonje Andreassen
 */

package controller;


import util.average;
import util.reportFileWriter;
import view.reportView;

public class reportController {
	private average averageUtil;
	private reportView reportView;
	private reportFileWriter reportFileWriter;
	
	public reportController(average averageUtil, reportView reportView, reportFileWriter reportFileWriter) {
		this.averageUtil = averageUtil ;
		this.reportView = reportView;
		this.reportFileWriter = reportFileWriter;
	}
}
