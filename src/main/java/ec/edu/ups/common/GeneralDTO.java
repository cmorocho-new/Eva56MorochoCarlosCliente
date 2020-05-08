package ec.edu.ups.common;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public abstract class GeneralDTO implements Serializable {
	
	private static final long serialVersionUID = 1828099409448735524L;

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
