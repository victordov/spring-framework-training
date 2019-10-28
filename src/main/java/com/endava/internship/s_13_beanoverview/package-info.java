/**
 * Bean Overview
 *
 * A Spring IoC container manages one or more beans. These beans are created with the configuration metadata that you supply to the container (for
 * example, in the form of XML <bean/> definitions).
 *
 * Within the container itself, these bean definitions are represented as BeanDefinition objects, which contain (among other information) the
 * following metadata:
 * <ul>
 * <li>A package-qualified class name: typically, the actual implementation class of the bean being defined.</li>
 *
 * <li>Bean behavioral configuration elements, which state how the bean should behave in the container (scope, lifecycle callbacks, and so forth).</li>
 *
 * <li>References to other beans that are needed for the bean to do its work. These references are also called collaborators or dependencies.</li>
 *
 * <li>Other configuration settings to set in the newly created object — for example, the size limit of the pool or the number of connections to use in a bean that manages a connection pool.</li>
 * </ul>
 * This metadata translates to a set of properties that make up each bean definition. The following table describes these properties:
 */
package com.endava.internship.s_13_beanoverview;
