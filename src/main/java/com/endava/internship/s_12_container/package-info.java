/**
 * <p>The <i> org.springframework.context.ApplicationContext</i> interface represents the Spring IoC container and is responsible for instantiating,
 * configuring, and assembling the beans. The container gets its instructions on what objects to instantiate, configure, and assemble by reading
 * configuration metadata. The configuration metadata is represented in XML, Java annotations, or Java code. It lets you express the objects that
 * compose your application and the rich interdependencies between those objects.</p>
 *<p></p>
 * <p>Several implementations of the <b>ApplicationContext</b> interface are supplied with Spring. In stand-alone applications, it is common to create an
 * instance of <b>ClassPathXmlApplicationContext</b> or <b>FileSystemXmlApplicationContext</b>. While XML has been the traditional format for defining configuration
 * metadata, you can instruct the container to use Java annotations or code as the metadata format by providing a small amount of XML configuration to
 * declaratively enable support for these additional metadata formats.</p>
 *<p></p>
 * <p>In most application scenarios, explicit user code is not required to instantiate one or more instances of a Spring IoC container. For example,
 * in a web application scenario, a simple eight (or so) lines of boilerplate web descriptor XML in the web.xml file of the application typically
 * suffices (see Convenient ApplicationContext Instantiation for Web Applications). If you use the Spring Tool Suite (an Eclipse-powered development
 * environment), you can easily create this boilerplate configuration with a few mouse clicks or keystrokes.</p>
 */
package com.endava.internship.s_12_container;
