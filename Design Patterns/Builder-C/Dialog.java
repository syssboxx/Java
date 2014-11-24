package lesson27_Builder;

public class Dialog {

	private String title = "";
	private String message = "";
	private String okButtonText = "";
	private String cancleButtonText = "";
	
	@Override
	public String toString() {
		String result = title + "\n" + message + "\n" + okButtonText
				+ "\n" + cancleButtonText;
		
		return result;
	}
	
	public static class Builder {
		
		private String title = "";
		private String message = "";
		private String okButtonText = "";
		private String cancleButtonText = "";
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}
		
		public Builder setOkButtonText(String text) {
			this.okButtonText = text;
			return this;
		}
		
		public Builder setCancelButtonText(String text) {
			this.cancleButtonText = text;
			return this;
		}
		
		public Dialog build() {
			
			final Dialog dialog = new Dialog();
			dialog.title = title;
			dialog.message = message;
			dialog.okButtonText = okButtonText;
			dialog.cancleButtonText = cancleButtonText;
			
			return dialog;
		}
	}
}
