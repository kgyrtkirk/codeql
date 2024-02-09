
@SuppressWarnings("lgtm[java/non-sync-override]")
@Deprecated
class TestSuppressWarnings {

    static class Asd implements Cloneable {
      int asd;
    }

    @SuppressWarnings("lgtm[]")
    static class Asd1 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("codeql[]")
    static class Asd2 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("lgtm")
    static class XAsd1 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("codeql")
    static class XAsd2 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("lgtm[java/missing-clone-method]")
    static class XXAsd1 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("codeql[java/missing-clone-method]")
    static class XXAsd2 implements Cloneable {
      int asd;
    }

    @SuppressWarnings("lgtm[]")
    public void test() {

    }
    @Deprecated
    @SuppressWarnings({"lgtm[java/confusing-method-name] not confusing","lgtm[java/non-sync-override]"})
    public void test2() {

    }
    @SuppressWarnings("lgtm")
    public void test3() {

    }
    @SuppressWarnings({"lgtm[java/confusing-method-name] blah blah lgtm[java/non-sync-override]"})
    public void test4() {

    }
    @SuppressWarnings("codeql[]")
    public void test5() {

    }
    @Deprecated
    @SuppressWarnings({"codeql[java/confusing-method-name] not confusing","codeql[java/non-sync-override]"})
    public void test6() {

    }
    @SuppressWarnings("lgtm")
    public void test7() {

    }
    @SuppressWarnings({"codeql[java/confusing-method-name] blah blah codeql[java/non-sync-override]"})
    public void test8() {

    }
}
