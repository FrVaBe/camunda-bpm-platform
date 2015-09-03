package org.camunda.bpm.engine.rest.wink;

import org.camunda.bpm.engine.rest.AbstractJobDefinitionRestServiceQueryTest;
import org.camunda.bpm.engine.rest.util.WinkTomcatServerBootstrap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.rules.TemporaryFolder;

public class JobDefinitionRestServiceQueryTest extends AbstractJobDefinitionRestServiceQueryTest {

  protected static WinkTomcatServerBootstrap serverBootstrap;

  @ClassRule
  public static TemporaryFolder temporaryFolder = new TemporaryFolder();

  @BeforeClass
  public static void setUpEmbeddedRuntime() {
    serverBootstrap = new WinkTomcatServerBootstrap();
    serverBootstrap.setWorkingDir(temporaryFolder.getRoot().getAbsolutePath());
    serverBootstrap.start();
  }

  @AfterClass
  public static void tearDownEmbeddedRuntime() {
    serverBootstrap.stop();
  }

}
