/**
 * <a href="https://docs.spring.io/spring/docs/5.2.0.RELEASE/spring-framework-reference/core.html#beans-factory-nature">1.6. Customizing the Nature of a Bean</a>
 * <p/>
 *
 * <div class="sect3">
 * <h4 id="aware-list"><a class="anchor" href="#aware-list"></a>1.6.3. Other <code>Aware</code> Interfaces</h4>
 * <div class="paragraph">
 * <p>Besides <code>ApplicationContextAware</code> and <code>BeanNameAware</code> (discussed <a href="#beans-factory-aware">earlier</a>),
 * Spring offers a wide range of <code>Aware</code> callback interfaces that let beans indicate to the container
 * that they require a certain infrastructure dependency. As a general rule, the name indicates the
 * dependency type. The following table summarizes the most important <code>Aware</code> interfaces:</p>
 * </div>
 * <table id="beans-factory-nature-aware-list" class="tableblock frame-all grid-all spread">
 * <caption class="title">Table 4. Aware interfaces</caption>
 * <colgroup>
 * <col style="width: 33.3333%;">
 * <col style="width: 33.3333%;">
 * <col style="width: 33.3334%;">
 * </colgroup>
 * <thead>
 * <tr>
 * <th class="tableblock halign-left valign-top">Name</th>
 * <th class="tableblock halign-left valign-top">Injected Dependency</th>
 * <th class="tableblock halign-left valign-top">Explained in…&#8203;</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>ApplicationContextAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Declaring <code>ApplicationContext</code>.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#beans-factory-aware"><code>ApplicationContextAware</code> and <code>BeanNameAware</code></a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>ApplicationEventPublisherAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Event publisher of the enclosing <code>ApplicationContext</code>.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#context-introduction">Additional Capabilities of the <code>ApplicationContext</code></a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>BeanClassLoaderAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Class loader used to load the bean classes.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#beans-factory-class">Instantiating Beans</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>BeanFactoryAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Declaring <code>BeanFactory</code>.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#beans-factory-aware"><code>ApplicationContextAware</code> and <code>BeanNameAware</code></a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>BeanNameAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Name of the declaring bean.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#beans-factory-aware"><code>ApplicationContextAware</code> and <code>BeanNameAware</code></a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>BootstrapContextAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Resource adapter <code>BootstrapContext</code> the container runs in. Typically available only in
 * JCA-aware <code>ApplicationContext</code> instances.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="integration.html#cci">JCA CCI</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>LoadTimeWeaverAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Defined weaver for processing class definition at load time.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#aop-aj-ltw">Load-time Weaving with AspectJ in the Spring Framework</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>MessageSourceAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Configured strategy for resolving messages (with support for parametrization and
 * internationalization).</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#context-introduction">Additional Capabilities of the <code>ApplicationContext</code></a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>NotificationPublisherAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Spring JMX notification publisher.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="integration.html#jmx-notifications">Notifications</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>ResourceLoaderAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Configured loader for low-level access to resources.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="#resources">Resources</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>ServletConfigAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Current <code>ServletConfig</code> the container runs in. Valid only in a web-aware Spring
 * <code>ApplicationContext</code>.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="web.html#mvc">Spring MVC</a></p></td>
 * </tr>
 * <tr>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><code>ServletContextAware</code></p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock">Current <code>ServletContext</code> the container runs in. Valid only in a web-aware Spring
 * <code>ApplicationContext</code>.</p></td>
 * <td class="tableblock halign-left valign-top"><p class="tableblock"><a href="web.html#mvc">Spring MVC</a></p></td>
 * </tr>
 * </tbody>
 * </table>
 * <div class="paragraph">
 * <p>Note again that using these interfaces ties your code to the Spring API and does not
 * follow the Inversion of Control style. As a result, we recommend them for infrastructure
 * beans that require programmatic access to the container.</p>
 * </div>
 * </div>
 */

package com.endava.internship.s_16_customization;
