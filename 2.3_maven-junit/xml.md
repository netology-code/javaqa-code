# XML

XML расшифровывается как eXtensible Markup Language (расширяемый язык разметки) - специальный язык, созданный для обмена структурированной информацией.

В нашем с вами случае, мы чаще всего будем встречаться с ним в виде файла `pom.xml`, в котором описана объектная модель нашего Maven проекта.

XML документ начинается с объявления, которое выглядит следующим образом:
```xml
<?xml version="1.0" encoding="UTF-8"?>
```

Это означает, что наш документ использует стандарт 1.0 и написан в кодировке UTF-8.

Далее документ состоит из тегов.

Тег - это специальный структурный элемент, который состоит из 4 частей:
1. Открывающий тег `<project>`
1. Закрывающий тег `</project>`
1. Атрибуты (пишутся только в открывающем теге): `<project attribute="value">`, при этом значения пишутся в кавычках
1. Содержимого (пишется между открывающим и закрывающим тегом)

Возникает ключевой вопрос: откуда берутся теги, атрибуты и т.д.? Где это написано?

На самом деле, к xml-документу обычно идёт XSD (Xml Schema Definition), он и определяет правила:
- какие теги можно использовать
- какие атрибуты есть у тегов
- какие теги какое содержимое могут иметь

Для Maven схема располагается по адресу: http://maven.apache.org/xsd/maven-4.0.0.xsd

И для тега `project` там написано следующее:
```xml
<xs:element name="project" type="Model">
  <xs:annotation>
    <xs:documentation source="version">3.0.0+</xs:documentation>
    <xs:documentation source="description">
      The <code>&lt;project&gt;</code> element is the root of the descriptor. The following table lists all of the possible child elements.
    </xs:documentation>
  </xs:annotation>
</xs:element>
```

Далее описан тип `Model`:
```xml
<xs:complexType name="Model">
  <xs:annotation>
    <xs:documentation source="version">3.0.0+</xs:documentation>
    <xs:documentation source="description">
      The <code>&lt;project&gt;</code> element is the root of the descriptor. The following table lists all of the possible child elements.
    </xs:documentation>
  </xs:annotation>
  <xs:all>
    <xs:element minOccurs="0" name="modelVersion" type="xs:string">
    <xs:annotation>
      <xs:documentation source="version">4.0.0+</xs:documentation>
      <xs:documentation source="description">
        Declares to which version of project descriptor this POM conforms.
      </xs:documentation>
    </xs:annotation>
  </xs:element>
  ...
  <xs:element minOccurs="0" name="groupId" type="xs:string">
    <xs:annotation>
      <xs:documentation source="version">3.0.0+</xs:documentation>
      <xs:documentation source="description">
        A universally unique identifier for a project. It is normal to use a fully-qualified package name to distinguish it from other projects with a similar name (eg. <code>org.apache.maven</code>).
      </xs:documentation>
    </xs:annotation>
  </xs:element>
  <xs:element minOccurs="0" name="artifactId" type="xs:string">
    <xs:annotation>
      <xs:documentation source="version">3.0.0+</xs:documentation>
      <xs:documentation source="description">
        The identifier for this artifact that is unique within the group given by the group ID. An artifact is something that is either produced or used by a project. Examples of artifacts produced by Maven for a project include: JARs, source and binary distributions, and WARs.
      </xs:documentation>
    </xs:annotation>
  </xs:element>
  <xs:element minOccurs="0" name="version" type="xs:string">
    <xs:annotation>
      <xs:documentation source="version">4.0.0+</xs:documentation>
      <xs:documentation source="description">
        The current version of the artifact produced by this project.
      </xs:documentation>
    </xs:annotation>
  </xs:element>
  ...
</xs:complexType>  
```

Что это значит для нас?
1. Неплохо бы приучить себя читать такие определения (т.к. именно в них написано, что, для чего и как)
1. Нельзя просто так взять, скопировать "кусок xml" и подставить куда угодно (т.к. правилами жёстко регламентируется, что, куда и когда можно подставлять)

Поэтому внимательно относитесь к тому, как именно вы оформляете xml-документ (следите за тем, чтобы это было сделано так же, как в лекции).
