package kodlamaioDemos.dataAccess.abstracts;

import java.util.List;
import kodlamaioDemos.entities.concretes.Instructor;

public interface IInstructorDao {
	void add(Instructor ─▒nstructor);
	void update(Instructor ─▒nstructor);
	void delete(Instructor ─▒nstructor);
	Instructor get(int id);
	List<Instructor> getAll();

}
