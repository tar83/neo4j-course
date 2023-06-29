package xyz.tar83.neo4jcourse.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String identifier;
	private String title;
	private String teacher;
	
//	@Relationship(type = "BELONGS_TO", direction = Direction.INCOMING)
//	private List<Lesson> lessons = new ArrayList<>();
	
	public Course() {
		
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

//	public List<Lesson> getLessons() {
//		return lessons;
//	}
}
