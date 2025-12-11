package com.testing.models;

public class Definition {
    private String character;
    private String pinyin;
    private String definition;

	//constructor
    public Definition (String character, String pinyin, String definition){
        this.character = character;
        this.pinyin = pinyin;
        this.definition = definition;
    }

	//get y set
    /**
	 * @param character
	 */
	public String getCharacter() {
		return character;
	}

	
	public void setCharacter(String character) {
		this.character = character;
	}

    /**
	 * @param pinyin
	 */
	public String getPinyin() {
		return pinyin;
	}

	
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

    /**
	 * @param definition
	 */
	public String getDefinition() {
		return definition;
	}

	
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	//para mostrar todos los datos del objeto
    @Override
    public String toString() {
		return "| " + character + " | " + pinyin + " | " + definition + " |";
	}



}
