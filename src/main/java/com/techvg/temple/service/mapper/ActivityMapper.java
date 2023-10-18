package com.techvg.temple.service.mapper;

import com.techvg.temple.domain.Activity;
import com.techvg.temple.service.dto.ActivityDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Activity} and its DTO {@link ActivityDTO}.
 */
@Mapper(componentModel = "spring")
public interface ActivityMapper extends EntityMapper<ActivityDTO, Activity> {}
