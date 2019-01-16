package at.fhv.badegr.application.models;

// Start of user code (user defined imports)

// End of user code

/*package*/ class HistoryItem {
	/**
	 * Description of the property text.
	 */
	public String text = null;
	
	/**
	 * Description of the property requested.
	 */
	public long requested = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.badegr.application.models.SearchResult result = null;
	
	/**
	 * Description of the property isRandomSearch.
	 */
	public boolean isRandomSearch = false;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getText(){
		   return this.text;
		}
		
		public void setText(String text){
		   this.text = text;
		}
		
		public long getRequested(){
		   return this.requested;
		}
		
		public void setRequested(long requested){
		   this.requested = requested;
		}
		
		public at.fhv.badegr.application.models.SearchResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.badegr.application.models.SearchResult result){
		   this.result = result;
		}
		
		public boolean getIsRandomSearch(){
		   return this.isRandomSearch;
		}
		
		public void setIsRandomSearch(boolean isRandomSearch){
		   this.isRandomSearch = isRandomSearch;
		}
		
	
}
