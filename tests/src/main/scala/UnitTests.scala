package biz.srinivasan.android.excusms.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

class UnitTests extends AndroidTestCase {
  def testPackageIsCorrect {
    assertEquals("biz.srinivasan.android.excusms", getContext.getPackageName)
  }
}