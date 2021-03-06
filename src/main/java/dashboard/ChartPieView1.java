
package dashboard;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.PieChartModel;

@Named(value = "chartPieView1")
@SessionScoped
public class ChartPieView1 implements Serializable {
    private PieChartModel pieModel1;
 
    @PostConstruct
    public void init() {
        createPieModels();
    }

    public PieChartModel getPieModel1() {
        return pieModel1;
    }
 
    private void createPieModels() {
        createPieModel1();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
 
        pieModel1.set("Brand 1", 540);
        pieModel1.set("Brand 2", 325);
        
          
 
        pieModel1.setTitle("Simple Pie");
        pieModel1.setLegendPosition("w");
        pieModel1.setShadow(false);
    }
  
}