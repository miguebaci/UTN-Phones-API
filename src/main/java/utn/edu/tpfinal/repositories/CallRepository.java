package utn.edu.tpfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import utn.edu.tpfinal.models.Call;

import java.util.Date;
import java.util.List;

@Repository
public interface CallRepository extends JpaRepository<Call, Integer> {
    @Query(value = "select * from calls where id_call = ?1", nativeQuery = true)
    List<Call> findOneByCallId(Integer idCall);

    @Query(value = "select * from calls c inner join phone_lines p  on c.line_origin = p.id_line inner join users u on u.id = p.id_user where u.id = ?1 AND c.date_call =?2", nativeQuery = true)
    List<Call> findCallsById(Integer idUser, Date date);
}
