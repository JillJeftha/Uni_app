/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uniapp.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Jill
 */
@Embeddable
public class Name implements Serializable{
    
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
