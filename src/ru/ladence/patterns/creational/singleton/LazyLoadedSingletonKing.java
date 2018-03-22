package ru.ladence.patterns.creational.singleton;


/**
 * Lazy-initialization of singleton
 * Also this approach is thread-safe without any language specifications
 */
class LazyLoadedSingletonKing {

    private LazyLoadedSingletonKing() {

    }

    /**
     * get single instance method using helper class. So it's provide lazy-init
     * @return singleton
     */
    static LazyLoadedSingletonKing getInstance() {
        return HelperKingLoader.INSTANCE;
    }

    private static class HelperKingLoader {
        static final LazyLoadedSingletonKing INSTANCE =  new LazyLoadedSingletonKing();
    }
}
