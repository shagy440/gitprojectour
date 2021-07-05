 package com.cg.myproject.domain;

 public class Store {

	
		private int id;
	
		private String name;
		
		private String description;
	
		private String pid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		@Override
		public String toString() {
			return "Project [id=" + id + ", name=" + name + ", description=" + description + ", pid=" + pid + "]";
		}
		
		
		
	}
