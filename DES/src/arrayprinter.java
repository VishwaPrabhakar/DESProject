/*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */

public class arrayprinter {
    
    /** Creates a new instance of arrayprinter */
    public arrayprinter() {
    }
    public static void printarray(String[][] arr,String label) {
       DesPanel.StepsText.append("-- "+label+" -- "+'\n');
        //System.out.println("-- "+label+" -- ");
        for(int i=0;i<arr.length ;i++) {
             DesPanel.StepsText.append("| ");
            for(int j=0;j<arr[0].length;j++) {
                
                 DesPanel.StepsText.append(arr[i][j]+" ");
            }
             DesPanel.StepsText.append("| "+'\n');
        }
    }
}
/*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */
