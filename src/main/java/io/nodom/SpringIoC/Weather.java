package io.nodom.SpringIoC;

public class Weather {

	private Long id;
	private Double hights;

	public Weather(Long id, Double hights) {
		super();
		this.id = id;
		this.hights = hights;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getHights() {
		return hights;
	}

	public void setHights(Double hights) {
		this.hights = hights;
	}
	
	

}
