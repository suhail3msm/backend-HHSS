package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hhis.IT2018144.Model.wardSectionesTable;

@Repository
public interface wardSectionesRepository extends JpaRepository<wardSectionesTable, Long> {

	@Query("FROM wardSectionesTable WHERE wardId = ?1 AND hospitalName = ?2 ORDER BY bedNumber")
	List<wardSectionesTable> FindByWardSectionesByWardId(long wordId, String hospitalName);

	@Query("FROM wardSectionesTable WHERE hospitalName = ?1 ORDER BY id")
	List<wardSectionesTable> listByWardSectionesByWardEmail(String hospitalName);

	@Transactional
	@Modifying
	@Query("DELETE FROM wardSectionesTable WHERE wardId = :wardId")
	Integer deleteByWardId(long wardId);
}
