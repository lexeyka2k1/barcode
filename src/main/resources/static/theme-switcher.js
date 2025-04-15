function toggleTheme() {
    const lightTheme = document.getElementById('light-theme');
    const currentTheme = lightTheme.disabled ? 'dark' : 'light';
    
    if (currentTheme === 'dark') {
        lightTheme.disabled = false;
        localStorage.setItem('theme', 'light');
    } else {
        lightTheme.disabled = true;
        localStorage.setItem('theme', 'dark');
    }
}

function initTheme() {
    const lightTheme = document.getElementById('light-theme');
    const savedTheme = localStorage.getItem('theme');
    const prefersLight = window.matchMedia('(prefers-color-scheme: light)').matches;
    
    // Учитываем сохранённую тему или системные настройки
    if (savedTheme === 'light' || (!savedTheme && prefersLight)) {
        lightTheme.disabled = false;
    } else {
        lightTheme.disabled = true;
    }
    
    // Назначаем обработчик кнопке
    document.getElementById('theme-toggle')?.addEventListener('click', toggleTheme);
}

document.addEventListener('DOMContentLoaded', initTheme);

// Реакция на изменение системных настроек
window.matchMedia('(prefers-color-scheme: light)').addEventListener('change', e => {
    if (!localStorage.getItem('theme')) {
        initTheme();
    }
});