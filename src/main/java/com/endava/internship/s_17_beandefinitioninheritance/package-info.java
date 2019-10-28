/**
 *<h3 id="beans-child-bean-definitions" tabindex="-1"><a class="anchor" href="#beans-child-bean-definitions"></a>1.7. Bean Definition Inheritance</h3>
 * <div class="paragraph">
 * <p>A bean definition can contain a lot of configuration information, including constructor
 * arguments, property values, and container-specific information, such as the initialization
 * method, a static factory method name, and so on. A child bean definition inherits
 * configuration data from a parent definition. The child definition can override some
 * values or add others as needed. Using parent and child bean definitions can save a lot
 * of typing. Effectively, this is a form of templating.</p>
 * </div>
 * <div></div>
 * <div class="paragraph">
 * <p>If you work with an <code>ApplicationContext</code> interface programmatically, child bean
 * definitions are represented by the <code>ChildBeanDefinition</code> class. Most users do not work
 * with them on this level. Instead, they configure bean definitions declaratively in a class
 * such as the <code>ClassPathXmlApplicationContext</code>. When you use XML-based configuration
 * metadata, you can indicate a child bean definition by using the <code>parent</code> attribute,
 * specifying the parent bean as the value of this attribute. The following example shows how
 * to do so:</p>
 * </div>
 */
package com.endava.internship.s_17_beandefinitioninheritance;
