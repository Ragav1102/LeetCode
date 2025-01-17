
function memoize(fn) {
    
    const cache = new Map(); 
    let callCount = 0; 
    const memoizedFn = function(...args) {
        const key = JSON.stringify(args); 
        if (!cache.has(key)) {
            callCount++; 
            cache.set(key, fn(...args)); 
        }
        return cache.get(key); 
    };
    memoizedFn.getCallCount = () => callCount; 
    return memoizedFn;
}