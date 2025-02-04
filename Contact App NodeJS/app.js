const readline = require('readline');
const saveContact = require('./contact');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const question = (text) => {
    return new Promise((resolve, rejects) => {
        rl.question(text, (value) => {
            return resolve(value);
        });
    });
};

( async () => {
    const nama = await question("Nama : ");
    const noHp = await question("No Hp : ");
    
    rl.close();

    saveContact(nama, noHp);
})();