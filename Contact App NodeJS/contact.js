const fs = require('fs');
const validator = require('validator');
const capitalize = require('./node_modules/capitalize/capitalize');

const saveContact = (nama, noHp) => {
    const dataPath = "./data";
    if (!fs.existsSync(dataPath)) {
        fs.mkdirSync(dataPath);
    }

    const filePath = "./data/contacts.json";
    if(!fs.existsSync(filePath)) {
        fs.writeFileSync(filePath, "[]", "utf-8");
    }

    let contacts = [];

    if(fs.existsSync(filePath)) {
        contacts = JSON.parse(fs.readFileSync(filePath, "utf-8"));
    }

    if (validator.isMobilePhone(noHp, "id-ID")) {
        try {

            const data = {
                Nama: capitalize(nama),
                No_Hp: noHp,
                Tanggal: new Date().toLocaleString()
            }

            contacts.push(data);

            fs.writeFileSync(filePath, `${JSON.stringify(contacts, null, 2)}`, "utf-8");
            console.log("Data kontak berhasil di simpan.");

        } catch (e) { 
            console.log("Data kontak gagal untuk di simpan!");    
        }
    } else {
        console.log("Maaf masukan no hp yang valid!");
    }
}

module.exports = saveContact;