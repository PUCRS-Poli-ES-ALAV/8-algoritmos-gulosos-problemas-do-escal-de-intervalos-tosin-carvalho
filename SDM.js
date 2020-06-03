    let listaS = [2, 4, 1, 6, 4, 6, 7,   9, 9,   3, 13  ] ;
    let listaF = [4, 5, 6, 7, 8, 9, 10, 11,  12,  13, 14];
    console.log(Guloso(listaS, listaF, 11));
    
    // function Guloso(s, f, n) {
    //     let x = []
    //     let i= 0
    //     while(i <= n) {
    //         x.push(f[i])
    //         var k = i + 1
    //         while( k <= n && s[k] < f[i]) {
    //             k = k+1
    //         }
    //         i = k
    //     }
    //     return x;
    // }

    function Guloso (s, f, n) {
        f[0] = Number.MIN_VALUE;
        let x = [];
        let i = 0;
        for(let k = 1; k < n; k++) {
            if(s[k] > f[i]) {
                x.push({S: s[k] , F: f[k]})
                i = k
            }
        }
        return x;
    }