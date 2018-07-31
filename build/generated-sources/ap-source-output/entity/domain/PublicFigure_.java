package entity.domain;

import entity.domain.Episode;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T14:22:00")
@StaticMetamodel(PublicFigure.class)
public class PublicFigure_ { 

    public static volatile SingularAttribute<PublicFigure, String> brief;
    public static volatile SingularAttribute<PublicFigure, String> name;
    public static volatile SingularAttribute<PublicFigure, Episode> episode;
    public static volatile SingularAttribute<PublicFigure, Integer> id;

}