package online.smartcompute.dempapp.model;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

@JsonInclude(Include.NON_NULL)
public class Student {

	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("age")
	private Integer age = null;

	/**
	 * male or female
	 */
	public enum SexEnum {
		MALE("male"),

		FEMALE("female");

		private String value;

		SexEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static SexEnum fromValue(String text) {
			for (SexEnum b : SexEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("sex")
	private SexEnum sex = null;

	public Student id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * unique identification of a student
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "unique identification of a student")

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * name of the student.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "name of the student.")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student age(Integer age) {
		this.age = age;
		return this;
	}

	/**
	 * age of the student minimum: 10 maximum: 40
	 * 
	 * @return age
	 **/
	@ApiModelProperty(value = "age of the student")

	@Min(10)
	@Max(40)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student sex(SexEnum sex) {
		this.sex = sex;
		return this;
	}

	/**
	 * male or female
	 * 
	 * @return sex
	 **/
	@ApiModelProperty(value = "male or female")

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return Objects.equals(this.id, student.id) && Objects.equals(this.name, student.name)
				&& Objects.equals(this.age, student.age) && Objects.equals(this.sex, student.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age, sex);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Student {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    age: ").append(toIndentedString(age)).append("\n");
		sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
