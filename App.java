package com.te.mavenpro;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class App 
{
   	int id;
    	String name;
    	
    	
    	
    	public App(int i, String string) {
    		super();
    		this.id = i;
    		this.name = string;
    	}



		@Override
		public String toString() {
			return "App [id=" + id + ", name=" + name + "]";
		}


    
    }

