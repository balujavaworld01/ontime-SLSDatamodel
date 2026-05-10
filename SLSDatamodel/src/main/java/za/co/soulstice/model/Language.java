package za.co.soulstice.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="languages")
public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String language;

	private String value;

	public Language() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}