const report = require('multiple-cucumber-html-reporter');

report.generate({
	jsonDir: './test/report/',
	reportPath: './test/report/',
	openReportInBrowser: true,
	metadata:{
        browser: {
            name: 'chrome',
            version: '60'
        },
        device: 'Local test machine',
        platform: {
            name: 'ubuntu',
            version: '16.04'
        }
    },
    customData: {
        title: 'Run info',
        data: [
            {label: 'Project', value: 'Custom project'},
            {label: 'Release', value: '1.2.3'},
            {label: 'Cycle', value: 'B11221.34321'},
            {label: 'Execution Start Time', value: 'May 16th 2022, 11:31 AM EST'},
            {label: 'Execution End Time', value: 'May 16th 2022, 11:32 AM EST'}
        ]
    }
});