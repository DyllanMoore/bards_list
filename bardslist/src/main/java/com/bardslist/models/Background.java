package com.bardslist.models;

public class Background {

		private int background_id;
		private String background;
		
		//boilerplate
		public Background() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Background(int background_id, String background) {
			super();
			this.background_id = background_id;
			this.background = background;
		}

		public Background(String background) {
			super();
			this.background = background;
		}

		@Override
		public String toString() {
			return "Background [background_id=" + background_id + ", background=" + background + "]";
		}

		public int getBackground_id() {
			return background_id;
		}

		public void setBackground_id(int background_id) {
			this.background_id = background_id;
		}

		public String getBackground() {
			return background;
		}

		public void setBackground(String background) {
			this.background = background;
		}
		
}
