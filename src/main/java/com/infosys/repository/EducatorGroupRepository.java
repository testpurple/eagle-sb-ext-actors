/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
package com.infosys.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.infosys.model.cassandra.EducatorGroupModel;
import com.infosys.model.cassandra.EducatorGroupPrimaryKeyModel;


@Repository
public interface EducatorGroupRepository extends CassandraRepository<EducatorGroupModel,EducatorGroupPrimaryKeyModel> {

	List<EducatorGroupModel> findByPrimaryKeyEducatorId(String userUUID);
}
