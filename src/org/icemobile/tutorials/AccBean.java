package org.icemobile.tutorials;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "accBean")
@ViewScoped
public class AccBean implements Serializable {

	private String selectedPane = "panel1";

	public void changeToPane3() {
		this.selectedPane = "panel3";
	}

	public String getSelectedPane() {
		return selectedPane;
	}

	public void setSelectedPane(String selectedPane) {
		this.selectedPane = selectedPane;
	}

}
